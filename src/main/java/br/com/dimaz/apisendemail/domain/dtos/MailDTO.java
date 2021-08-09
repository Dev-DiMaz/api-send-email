package br.com.dimaz.apisendemail.domain.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MailDTO {
	/*
	*	o email de ORIGEM eh padrao, 
	*	mas pode aceitar como parametro tambem, desde que esteja no dominio liberado na AWS
	*	
	*	alem destes campo tem outros como cc cco 
	*/
	private String to;
	
	private String subject;
	
	private String body;
}
