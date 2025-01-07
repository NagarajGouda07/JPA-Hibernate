package com.xworkz.onlinebooking.componet;

import com.xworkz.onlinebooking.dto.HotelRoomDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class HotelRoom {
    public HotelRoom(){
        System.out.println("This is a hotelRoom const...");

    }

    @RequestMapping("/HotelRoom")
    public String hotelRoom(HotelRoomDTO hotelRoomDTO){
        System.out.println("HotelRoomDTO = "+ hotelRoomDTO);
        return "hotelRoom.jsp";
    }
}
