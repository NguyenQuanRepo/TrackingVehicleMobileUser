package com.vanth.trackingvehicleuser.Entity;

import java.time.LocalDateTime;

public class Schedule {
    String vehicle_id;
    LocalDateTime start_time;
    float start_x;
    float start_y;
    LocalDateTime finish_time;
    float finish_x;
    float finish_y;
    int status;
    LocalDateTime finish;

    public String getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(String vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public LocalDateTime getStart_time() {
        return start_time;
    }

    public void setStart_time(LocalDateTime start_time) {
        this.start_time = start_time;
    }

    public float getStart_x() {
        return start_x;
    }

    public void setStart_x(float start_x) {
        this.start_x = start_x;
    }

    public float getStart_y() {
        return start_y;
    }

    public void setStart_y(float start_y) {
        this.start_y = start_y;
    }

    public LocalDateTime getFinish_time() {
        return finish_time;
    }

    public void setFinish_time(LocalDateTime finish_time) {
        this.finish_time = finish_time;
    }

    public float getFinish_x() {
        return finish_x;
    }

    public void setFinish_x(float finish_x) {
        this.finish_x = finish_x;
    }

    public float getFinish_y() {
        return finish_y;
    }

    public void setFinish_y(float finish_y) {
        this.finish_y = finish_y;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public LocalDateTime getFinish() {
        return finish;
    }

    public void setFinish(LocalDateTime finish) {
        this.finish = finish;
    }
}
