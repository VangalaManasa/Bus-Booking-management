package com.bus;

import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bus.dto.Crendentials;
import com.bus.model.Bus;
import com.bus.model.BusSchedule;
import com.bus.model.Ticket;
import com.bus.model.User;
import com.bus.service.BusScheduleService;
import com.bus.service.BusService;
import com.bus.service.TicketService;
import com.bus.service.UserService;

@Controller
public class UserController {

//here we are creating beans

	@Autowired
	UserService userService;
	@Autowired
	BusScheduleService busScheduleService;
	@Autowired
	BusService busService;
	@Autowired
	TicketService ticketService;

	/*
	 * Controller is used to get the login form
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "login";
	}

	/*
	 * Controller is used to validate the login details
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String authenticateUser(@ModelAttribute("cred") Crendentials crendentials, Model model) {

		boolean isExists = userService.authenticateUser(crendentials.getUserName(), crendentials.getPassword());
		if (isExists) {
			return "busjourneydetails";
		}
		return "fail";
	}

	/*
	 * Controller is used to go back to the register page if user dont have an
	 * account
	 */
	@RequestMapping(value = "/register")
	public String home2() {
		return "register";

	}

	/*
	 * Controller is used to do registration and save the details in database
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("user") User user) {
		userService.saveUser(user);
		return "busjourneydetails";
	}

	/*
	 * Controller is used to search the buses based on source and destination and
	 * date
	 */
	@RequestMapping(value = "/buses", method = RequestMethod.POST)
	public String search(@RequestParam("source") String source, @RequestParam("destination") String destination,
			@RequestParam("departureDate") Date departureDate, Model model) {
		System.out.println(departureDate);
		List<BusSchedule> busList = busScheduleService.getBuses(source, destination, departureDate);
		if (busList != null) {
			model.addAttribute("busList", busList);
			return "busview";

		}
		return "invalid";

	}

	/*
	 * Controller is used to get the buses
	 */
	@RequestMapping(value = "/busList")
	public String flightList(Model model, @RequestParam int busScheduleId, @RequestParam String busNumber) {
		try {
			BusSchedule busSchedule = busScheduleService.busDetail(busScheduleId);
			model.addAttribute("busSchedule", busSchedule);
			List<Bus> bus = busService.busDetail(busNumber);
			model.addAttribute("bus", bus);
			return "busSchedule";
		} catch (Exception e) {
			System.out.println(e);
			return "invalid";
		}

	}

	/*
	 * Controller is used to get the ticket details
	 */
	@RequestMapping(value = "/ticketDetails")
	public String ticketDetails(Model model, @RequestParam int busScheduleId, @RequestParam int busId,
			@RequestParam String source, @RequestParam String destination) {
		try {
			List<Ticket> ticketdetails = ticketService.saveTicketDetails(busScheduleId, busId);
			model.addAttribute("ticketdetails", ticketdetails);
			model.addAttribute("source", source);
			model.addAttribute("destination", destination);
			return "details";

		} catch (Exception e) {
			System.out.println(e);
			return "invalid";
		}
	}

}
