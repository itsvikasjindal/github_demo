package com.ericsson.sidp.clm;

import java.io.File;
import java.lang.management.ManagementFactory;

public class SystemConfiguration {

	public static void main(String[] args) {
		SystemConfiguration systemConfiguration = new SystemConfiguration();
		SystemProperties prop = systemConfiguration.setSystemParameters();
		systemConfiguration. printSystemParameters(prop);
	}
	
	private SystemProperties setSystemParameters()
	{
		SystemProperties prop = new SystemProperties();
		prop.setMacAddress(NetworkInterfaces.getInstance().getMacAddress());
		prop.setIpAddress(NetworkInterfaces.getInstance().getIpAddress());
		prop.setHostname(System.getenv("HOSTNAME"));
		prop.setDiskTotalSpace(new File("/").getTotalSpace());
        prop.setUserName(System.getProperty("LOGNAME"));
        long memorySize = ((com.sun.management.OperatingSystemMXBean) 
        		ManagementFactory.getOperatingSystemMXBean()).getTotalPhysicalMemorySize();
        prop.setRamSize(memorySize);
        return prop;
	}
	
	private void printSystemParameters(SystemProperties prop)
	{
		System.out.println("MacAddress : " + prop.getMacAddress());
		System.out.println("IpAddress : " + prop.getIpAddress());
		System.out.println("Hostname : " + prop.getHostname());
		System.out.println("DiskTotalSpace : " + prop.getDiskTotalSpace());
		System.out.println("UserName : " + prop.getUserName());
		System.out.println("RamSize : " + prop.getRamSize());
	}
}