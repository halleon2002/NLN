package com.qlpk.QLPK;

import com.qlpk.QLPK.repository.BenhNhanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QlpkApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(QlpkApplication.class, args);
	}

	@Autowired
	private BenhNhanRepository benhNhanRepository;

	@Override
	public void run(String... args) throws Exception {

	}
}
