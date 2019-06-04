package ua.lviv.iot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ua.lviv.iot.components.models.CoolingSystem;
import ua.lviv.iot.components.models.VideoCard;
import ua.lviv.iot.components.repositories.CoolingSystemRepository;
import ua.lviv.iot.components.repositories.VideoCardRepository;

@SpringBootApplication
public class Lab8Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab8Application.class, args);
	}

//	@Bean
//	public CommandLineRunner coolingSystemBean(
//			final CoolingSystemRepository coolingSystemRepository) {
//		CoolingSystem component = new CoolingSystem(
//				"cooler 3000", 2700.0, 12, 2018, 14, 250);
//		return (args) -> {
//			coolingSystemRepository.save(component);
//		};
//	}
//
//	@Bean
//	public CommandLineRunner videoCardSystemBean(
//			final VideoCardRepository videoCardSystemBean) {
//		VideoCard component = new VideoCard(
//				"cooler 3000", 2700.0, 12, 2018, 8, 1600, 2700);
//		return (args) -> {
//			videoCardSystemBean.save(component);
//		};
//	}

}
