package com.ssoure.jsoutput;

public class Impressora_eng extends Impressora_pt{
			
		// Variaveis exclusivas de impressoras SP3510DN
		String check_erro_dev_sc = "Service call";		
		String check_tonner_not_set = "Not Set";
			
	public String[] Check(String impressora) {
		
			// Condição para verificar status da impressoras			
			if (impressora.contains(check_erro_dev_sc)) {
				status_imp = "Impressora com algum defeito detectado";
			} else if (impressora.contains(check)) {
				status_imp = "Status Geral OK";
			} else {
				status_imp = "Impressora com algum defeito detectado (falso positivo)";
			}
			// Condição para verificar tonner vazio
			if (impressora.contains(check_tonner_status)) {
				tonner_vazio = "Tonner Vazio, favor realizar troca";
			} else {
				tonner_vazio = "Tonner OK";
			}
			// Condição para verificar se impressora está sem tonner
			if (impressora.contains(check_tonner_not_set)) {
				System.out.println("---IMPRESSORA SEM TONNER DETECTADO---");

				// Condição para verificar tonner quase vazio
				if (impressora.contains(check_tonner_status_acab)) {
					tonner_vazio = "Tonner quase vazio, favor programar troca";
				} else {
					tonner_vazio = "Tonner OK";
				}
			}
			// Array para guardar os resultados em uma String
			String[] resultado_eng = new String [2];
			resultado_eng[0] = status_imp;
			resultado_eng[1] = tonner_vazio;			
						
			return resultado_eng;			
		}
}
