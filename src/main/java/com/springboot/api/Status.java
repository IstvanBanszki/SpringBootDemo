package com.springboot.api;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public class Status implements Serializable {

    private final LocalDateTime startTime;
    private LocalDateTime requestTime;
    
    public Status(LocalDateTime startTime) {
        this.startTime = startTime;
        this.requestTime = null;
    }

    public LocalDateTime getStartTime() {
        return this.startTime;
    }

    public LocalDateTime getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(LocalDateTime requestTime) {
        this.requestTime = requestTime;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.startTime, this.requestTime);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Status other = (Status) obj;
        return Objects.equals(this.startTime, other.startTime) &&
                Objects.equals(this.requestTime, other.requestTime);
    }

    @Override
    public String toString() {
        return "Status{startTime=" + startTime + ", requestTime=" + requestTime + '}';
    }
    
}
