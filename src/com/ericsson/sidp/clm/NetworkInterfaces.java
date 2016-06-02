package com.ericsson.sidp.clm;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;

public class NetworkInterfaces {

	private static NetworkInterfaces networkInterfaces = null;

	private NetworkInterfaces()
	{
	}

	public static NetworkInterfaces getInstance()
	{
		if(networkInterfaces == null)
		{
			networkInterfaces = new NetworkInterfaces();
		}
		return networkInterfaces;
	}

	public String getMacAddress()
	{
		StringBuilder macAddressBuilder = new StringBuilder();
		try
		{
			InetAddress ipAddress = InetAddress.getLocalHost();
			NetworkInterface networkInterface = NetworkInterface
					.getByInetAddress(ipAddress);
			byte[] macAddressBytes = networkInterface.getHardwareAddress();

			for (int macAddressByteIndex = 0; macAddressByteIndex < macAddressBytes.length; macAddressByteIndex++)
			{
				String macAddressHexByte = String.format("%02X",
						macAddressBytes[macAddressByteIndex]);
				macAddressBuilder.append(macAddressHexByte);

				if (macAddressByteIndex != macAddressBytes.length - 1)
				{
					macAddressBuilder.append(":");
				}
			}
		}
		catch (UnknownHostException e)
		{
			return "";
		}
		catch (SocketException e)
		{
			return "";
		}

		return macAddressBuilder.toString();
	}
	
	public String getIpAddress()
	{
		StringBuilder ipAddressBuilder = new StringBuilder();
		try
		{
			Enumeration<NetworkInterface> networkInterfaces = 
					NetworkInterface.getNetworkInterfaces();
			while(networkInterfaces.hasMoreElements())
			{
			    NetworkInterface networkInterface = 
			    		(NetworkInterface) networkInterfaces.nextElement();
			    Enumeration<InetAddress> inetAddresses = 
			    		networkInterface.getInetAddresses();
			    while (inetAddresses.hasMoreElements())
			    {
			        InetAddress inetAddress = (InetAddress) inetAddresses.nextElement();
			        ipAddressBuilder.append(" " + inetAddress.getHostAddress());
			    }
			}
		}
		catch (SocketException e)
		{
			return "";
		}
		return ipAddressBuilder.toString();
	}	
}

