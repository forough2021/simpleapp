package com.HelloWorld;
import redis.clients.jedis.*;

public class HelloWorld {

	public static void main(String[] args) {

		Jedis jedis = new Jedis("localhost"); 
		  System.out.println("Connection to server sucessfully"); 
		  System.out.println("Hello world Redis"); 
		  System.out.println("Server is running: "+jedis.ping()); 
		}
}