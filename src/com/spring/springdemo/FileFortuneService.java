package com.spring.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {
	private String fileName="data.txt";
	private List<String> listFortune;
	
	private Random myRandom=new Random();
	
	/*
	public FileFortuneService() throws URISyntaxException {
		File root = new File(Thread.currentThread().getContextClassLoader().getResource("").toURI());
		File file=new File(root,fileName);
		System.out.println("Reading from file:"+file);
		System.out.println("File exists? "+file.exists());
		
		//initialize the arraylist
		listFortune=new ArrayList<String>();
		try(BufferedReader br=new BufferedReader(new FileReader(file))){
			String tempFortune;
			while((tempFortune=br.readLine())!= null)
			{
				listFortune.add(tempFortune);
			}
		}catch(Exception e)
		{
			System.out.println("Exception");
		}
		
	}*/
	
	@PostConstruct
	public void getDataFromFile() throws URISyntaxException {
		System.out.println("Inside postConstruct of FileFortuneService");
		File root = new File(Thread.currentThread().getContextClassLoader().getResource("").toURI());
		File file=new File(root,fileName);
		System.out.println("Reading from file:"+file);
		System.out.println("File exists? "+file.exists());
		
		//initialize the arraylist
		listFortune=new ArrayList<String>();
		try(BufferedReader br=new BufferedReader(new FileReader(file))){
			String tempFortune;
			while((tempFortune=br.readLine())!= null)
			{
				listFortune.add(tempFortune);
			}
		}catch(Exception e)
		{
			System.out.println("Exception");
		}
	}
	@Override
	public String getFortune() {
		int index=myRandom.nextInt(listFortune.size());
		String result=listFortune.get(index);
		return result;
	}

}
