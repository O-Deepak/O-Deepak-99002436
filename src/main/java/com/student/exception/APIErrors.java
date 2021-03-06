package com.student.exception;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.http.HttpStatus;
public class APIErrors {
    
        String messag;
        LocalDateTime timeStamp;
        HttpStatus status;
        List<String> details;
        
        
        public APIErrors() {
            super();
            // TODO Auto-generated constructor stub
        }
        
        public APIErrors(String messag, LocalDateTime timeStamp, HttpStatus status, List<String> details) {
            super();
            this.messag = messag;
            this.timeStamp = timeStamp;
            this.status = status;
            this.details = details;
        }

 

        public String getMessag() {
            return messag;
        }
        public void setMessag(String messag) {
            this.messag = messag;
        }
        public LocalDateTime getTimeStamp() {
            return timeStamp;
        }
        public void setTimeStamp(LocalDateTime timeStamp) {
            this.timeStamp = timeStamp;
        }
        public HttpStatus getStatus() {
            return status;
        }
        public void setStatus(HttpStatus status) {
            this.status = status;
        }
        public List<String> getDetails() {
            return details;
        }
        public void setDetails(List<String> details) {
            this.details = details;
        }
        @Override
        public String toString() {
            return "APIErrors [messag=" + messag + ", timeStamp=" + timeStamp + ", status=" + status + ", details="
                    + details + "]";
        }
        
        
        
        
        
        
        
    }