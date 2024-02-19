package com.infy.utility;

import java.time.LocalDateTime;

public class ErrorInfo {
private String errorMessage;
private Integer errorCode;
private LocalDateTime timeStamp;
public String getErrorMessage() {
	return errorMessage;
}
public void setErrorMessage(String errorMessage) {
	this.errorMessage = errorMessage;
}
public Integer getErrorCode() {
	return errorCode;
}
public void setErrorCode(Integer errorCode) {
	this.errorCode = errorCode;
}
public LocalDateTime getTimeStamp() {
	return timeStamp;
}
public void setTimeStamp(LocalDateTime timeStamp) {
	this.timeStamp = timeStamp;
}
}
