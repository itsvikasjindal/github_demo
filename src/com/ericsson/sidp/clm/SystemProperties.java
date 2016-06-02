package com.ericsson.sidp.clm;

public class SystemProperties {
	private String macAddress;
	private String ipAddress;
	private long ramSize;
	private long diskTotalSpace;
	private long diskFillSpace;
	private long diskFreeSpace;
	private String hostname;
	private String userName;

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getHostname() {
		return hostname;
	}
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	public String getMacAddress() {
		return macAddress;
	}
	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public long getRamSize() {
		return ramSize;
	}
	public void setRamSize(long ramSize) {
		this.ramSize = ramSize;
	}
	public long getDiskTotalSpace() {
		return diskTotalSpace;
	}
	public void setDiskTotalSpace(long diskTotalSpace) {
		this.diskTotalSpace = diskTotalSpace;
	}
	public long getDiskFillSpace() {
		return diskFillSpace;
	}
	public void setDiskFillSpace(long diskFillSpace) {
		this.diskFillSpace = diskFillSpace;
	}
	public long getDiskFreeSpace() {
		return diskFreeSpace;
	}
	public void setDiskFreeSpace(long diskFreeSpace) {
		this.diskFreeSpace = diskFreeSpace;
	}
}
