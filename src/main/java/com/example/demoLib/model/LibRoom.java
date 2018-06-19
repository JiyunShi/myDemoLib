package com.example.demoLib.model;

import org.springframework.stereotype.Component;

@Component
public class LibRoom {

    private Integer roomId;
    private Boolean isLibRoom = true;


    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Boolean getLibRoom() {
        return isLibRoom;
    }

    public void setLibRoom(Boolean libRoom) {
        isLibRoom = libRoom;
    }





}
