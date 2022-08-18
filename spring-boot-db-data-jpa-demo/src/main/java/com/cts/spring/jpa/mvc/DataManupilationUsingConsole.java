package com.cts.spring.jpa.mvc;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.cts.spring.jpa.mvc.entity.Transaction;
import com.cts.spring.jpa.mvc.entity.TransactionType;
import com.cts.spring.jpa.mvc.service.TransactionServices;

@Component
public class DataManupilationUsingConsole implements ApplicationRunner {
	
	@Autowired
	private TransactionServices txnService;
	
	@Autowired
	private DateTimeFormatter dtFormatter;

	@Autowired
	private Scanner scanner;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Menu menu = null;
		Menu[] menus = Menu.values();

		while (menu != Menu.QUIT) {
			
			System.out.println("Menus");
			Arrays.stream(menus).map(m -> m.ordinal() + "\t" + m).forEach(System.out::println);
			System.out.print("Choice: ");
			int ch = scanner.nextInt();

			if (ch < 0 || ch >= menus.length) {
				
				System.out.println("Invlaid Choice");
				continue;
			}

			menu = menus[ch];

			switch (menu) {
			
			case LIST:
				
				doList();
				break;
				
			case ADD:
				
				doAdd();
				break;
				
			case DELETE:
				
				doDelete();
				break;
				
			case QUIT:
				
				System.out.println("App Terminated!");
				break;
			}
		}
	}

	private void doDelete() {
		
		System.out.println("Enter Transaction Id to delete : ");
		long txnId = scanner.nextLong();
		
		txnService.remove(txnId);
		
	}

	private void doAdd() {
		
		Transaction txn = new Transaction();
		
		System.out.println("Enter Transaction Description: ");
		txn.setDescription(scanner.next());
		
		
		System.out.print("EnterDate(dd-MM-yy): ");
		txn.setTxnDate(LocalDate.parse(scanner.next(), dtFormatter));
		
		System.out.print("Enter Transaction Type(CREDIT|DEBIT): ");
		txn.setType(TransactionType.valueOf(scanner.next()));
		
		System.out.print("Enter Transaction Amount: ");
		txn.setAmount(scanner.nextDouble());
		
		txnService.add(txn);
		
	}

	private void doList() {
		
		List<Transaction> txns = txnService.getAll();
		
		if(txns.isEmpty()) {
			System.out.println("No records to display");
		}else {
			txns.stream().forEach(System.out::println);
		}	
	}

}
