package br.com.dimaz.apisendemail.domain.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Mail {
	/*
	*	vai ser usada se quiser salvar em banco os registros de emails enviados
	*/
	private String para;
	
	private String assunto;
	
	private String corpo;
}
