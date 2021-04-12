package com.ssoure.jsoutput;

public class Impressora_pt {
	
		String check = "Status OK";
		String check_tonner_status_acab = "Cartucho quase vazio";
		String check_tonner_status = "Cartucho vazio";
		String check_sem_tonner = "não está";
		String check_erro = "Erro";
		
			// Variaveis de checagem
		String status_imp = null;
		String tonner_vazio = null;
						
	public String[] Check(String impressora) {
		
			// Condição para verificar status da impressoras
			if (impressora.contains(check)) {
				status_imp = "Status Geral OK";
			} else {
				status_imp = "Impressora com algum defeito detectado";
			}
			// Condição para verificar tonner vazio
			if (impressora.contains(check_tonner_status)) {
				tonner_vazio = "Tonner Vazio, favor realizar troca";
			} else {
				tonner_vazio = "Tonner OK";
			}
			// Condição para verificar se impressora está sem tonner
			if (impressora.contains(check_sem_tonner)) {
				System.out.println("---IMPRESSORA SEM TONNER DETECTADO---");

				// Condição para verificar tonner quase vazio
				if (impressora.contains(check_tonner_status_acab)) {
					tonner_vazio = "Tonner quase vazio, favor programar troca";
				} else {
					tonner_vazio = "Tonner OK";
				}
			}
			// Array para guardar os resultados em uma String
			String[] resultado = new String [2];
			resultado[0] = status_imp;
			resultado[1] = tonner_vazio;			
						
			return resultado;			
		}
	
	}


