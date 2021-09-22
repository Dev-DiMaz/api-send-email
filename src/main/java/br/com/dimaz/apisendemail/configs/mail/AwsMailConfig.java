package br.com.dimaz.apisendemail.configs.mail;

import org.springframework.cloud.aws.mail.simplemail.SimpleEmailServiceJavaMailSender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClientBuilder;

@Configuration
public class AwsMailConfig {
	
	private AwsMailPropertyConfig config;

	public AwsMailConfig(final AwsMailPropertyConfig config) {
		this.config = config;
	}
	
	/*
	 * alterar
	 * withRegion(variavel_de_ambiente)
	 */
	@Bean
	public AmazonSimpleEmailService amazonSimpleEmailService() {
		return AmazonSimpleEmailServiceClientBuilder.standard()
				.withCredentials(
						new AWSStaticCredentialsProvider(
								new BasicAWSCredentials(config.awsAccessKey, config.awsSecretKey)))
				.withRegion(Regions.US_EAST_1)
				.build();
	}
	
	@Bean
	public JavaMailSender javaMailSender(AmazonSimpleEmailService ses) {
		return new SimpleEmailServiceJavaMailSender(ses);
	}
	
}
