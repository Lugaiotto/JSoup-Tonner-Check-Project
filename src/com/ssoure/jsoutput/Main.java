package com.ssoure.jsoutput;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Main extends Impressora_pt {

	public static void main(String[] args) {

		// Document de cada impressora
		Document doc_imp_ti = null;
		Document doc_imp_rh_color = null;
		Document doc_imp_rh_pb = null;
		Document doc_imp_exp = null;
		Document doc_imp_fis = null;
		Document doc_imp_pcp = null;
		Document doc_imp_qua = null;
		Document doc_imp_aut = null;
		Document doc_imp_polo_apont = null;
		Document doc_imp_eco = null;
		Document doc_imp_laba = null;
		Document doc_imp_labd = null;
		Document doc_imp_alm = null;
		Document doc_imp_vendas_st = null;
		Document doc_imp_man = null;

		//Objeto Impressora 
		Impressora_pt impressora = new Impressora_pt();
		
		//Objeto Impressora modelo menu em ingles (eng)
		Impressora_eng impressora_eng = new Impressora_eng();
		
		//String dos resultados das checagens
		String[] resultado_check = new String[2];
		String[] resultado_check_eng = new String[2];
		
		// --------------------------------------------------------------------------------------------
		// Conexão à impressora TI
		try {
			// Conexão ao menu RICOH da impressora TI 192.168.10.1
			doc_imp_ti = Jsoup.connect("http://192.168.10.1/web/guest/br/websys/webArch/getStatus.cgi").get();
			String status_geral_ti = doc_imp_ti.getElementsByClass("listboxddm").text();
			
			//Chamada metodo check (Impressora_pt)
			resultado_check = impressora.Check(status_geral_ti);
						
			// Tela para mostrar os status das impressoras:
			System.out.println(" Status Impressora TI (192.168.10.1): " + resultado_check[0] + "\n Status Tonner TI: "
					+ resultado_check[1]
					+ "\n ----------------------------------------------------------------------------------------------------");
			}
		// Erro caso a impressora não responda
		catch (IOException e) {
			System.out.println("Impressora TI (192.168.10.1) está desligada ou fora de serviço "
					+ "\n ---------------------------------------------------------------------------------------------------- ");
		}
		// --------------------------------------------------------------------------------------------
		// Conexão à impressora RH Colorida
		try {
			doc_imp_rh_color = Jsoup.connect("http://192.168.10.15/web/guest/br/websys/webArch/getStatus.cgi").get();
			String status_geral_rh_color = doc_imp_rh_color.getElementsByClass("listboxddm").text();
			
			resultado_check = impressora.Check(status_geral_rh_color);
			
			// Tela para mostrar os status das impressoras:
			System.out.println(" Status Impressora RH Color (192.168.10.15): " + resultado_check[0] + "\n Status Tonner RH Color: "
					+ resultado_check[1]
					+ "\n ----------------------------------------------------------------------------------------------------");
			
		} catch (IOException e) {
			System.out.println("Impressora RH Color(192.168.10.15) está desligada ou fora de serviço "
					+ "\n ---------------------------------------------------------------------------------------------------- ");
		}
		// --------------------------------------------------------------------------------------------
		// Conexão à impressora RH P&B
		try {
			doc_imp_rh_pb = Jsoup.connect("http://192.168.10.4/web/guest/pt/websys/webArch/mainFrame.cgi").get();
			String status_geral_rh_pb = doc_imp_rh_pb.getElementsByClass("staticProp").text();
						
			resultado_check_eng = impressora_eng.Check(status_geral_rh_pb);
			// Tela para mostrar os status das impressoras:
			System.out.println(" Status Impressora RH P&B (192.168.10.4): " + resultado_check_eng[0] + "\n Status Tonner RH P&B: "
					+ resultado_check_eng[1]
					+ "\n ----------------------------------------------------------------------------------------------------");
			}

		catch (IOException e) {
			System.out.println("Impressora RH P&B (192.168.10.4) está desligada ou fora de serviço "
					+ "\n ---------------------------------------------------------------------------------------------------- ");
		}
		// --------------------------------------------------------------------------------------------
		// Conexão à impressora Expedição
		try {

			doc_imp_exp = Jsoup.connect("http://192.168.10.12/web/guest/br/websys/webArch/getStatus.cgi").get();
			String status_geral_exp = doc_imp_exp.getElementsByClass("listboxddm").text();

			resultado_check = impressora.Check(status_geral_exp);
			// Tela para mostrar os status das impressoras:
			System.out.println(" Status Impressora Expedicao (192.168.10.12): " + resultado_check[0]
					+ "\n Status Tonner Expedicao: " + resultado_check[1]
					+ "\n ----------------------------------------------------------------------------------------------------");
		} catch (IOException e) {
			System.out.println("Impressora Expedição (192.168.10.12) está desligada ou fora de serviço "
					+ "\n ---------------------------------------------------------------------------------------------------- ");
		}
		// --------------------------------------------------------------------------------------------
		// Conexão à impressora Fiscal
		try {
			doc_imp_fis = Jsoup.connect("http://192.168.10.2/web/guest/br/websys/webArch/getStatus.cgi").get();
			String status_geral_fis = doc_imp_fis.getElementsByClass("listboxddm").text();

			resultado_check = impressora.Check(status_geral_fis);
			// Tela para mostrar os status das impressoras:

			System.out.println(" Status Impressora Fiscal (192.168.10.2): " + resultado_check[0] + "\n Status Tonner Fiscal: "
					+ resultado_check[1]
					+ "\n ----------------------------------------------------------------------------------------------------");
		} catch (IOException e) {
			System.out.println("Impressora Fiscal (192.168.10.2) está desligada ou fora de serviço "
					+ "\n ---------------------------------------------------------------------------------------------------- ");
		}
		// --------------------------------------------------------------------------------------------
		// Conexão à impressora PCP
		try {
			doc_imp_pcp = Jsoup.connect("http://192.168.10.11/web/guest/br/websys/webArch/getStatus.cgi").get();
			String status_geral_pcp = doc_imp_pcp.getElementsByClass("listboxddm").text();

			resultado_check = impressora.Check(status_geral_pcp);
			// Tela para mostrar os status das impressoras:
			System.out.println(" Status Impressora PCP (192.168.10.11): " + resultado_check[0] + "\n Status Tonner PCP: "
					+ resultado_check[1]
					+ "\n ----------------------------------------------------------------------------------------------------");
		} catch (IOException e) {
			System.out.println("Impressora PCP (192.168.10.11) está desligada ou fora de serviço "
					+ "\n ---------------------------------------------------------------------------------------------------- ");
		}
		// --------------------------------------------------------------------------------------------
		// Conexão à impressora Qualidade
		try {

			doc_imp_qua = Jsoup.connect("http://192.168.10.16/web/guest/br/websys/webArch/getStatus.cgi").get();
			String status_geral_qua = doc_imp_qua.getElementsByClass("listboxddm").text();
			
			resultado_check = impressora.Check(status_geral_qua);
			// Tela para mostrar os status das impressoras:
			System.out.println(" Status Impressora Qualidade (192.168.10.16): " + resultado_check[0]
					+ "\n Status Tonner Qualidade: " + resultado_check[1]
					+ "\n ----------------------------------------------------------------------------------------------------");
		} catch (IOException e) {
			System.out.println("Impressora Qualidade (192.168.10.16) está desligada ou fora de serviço "
					+ "\n ---------------------------------------------------------------------------------------------------- ");
		}
		// --------------------------------------------------------------------------------------------
		// Conexão à impressora Eng. Automação
		try {
			
			doc_imp_aut = Jsoup.connect("http://192.168.10.5/web/guest/br/websys/webArch/getStatus.cgi").get();
			String status_geral_aut = doc_imp_aut.getElementsByClass("listboxddm").text();
			
			resultado_check = impressora.Check(status_geral_aut);
			// Tela para mostrar os status das impressoras:
			System.out.println(" Status Impressora Automação (192.168.10.5): " + resultado_check[0]
					+ "\n Status Tonner Qualidade: " + resultado_check[1]
					+ "\n ----------------------------------------------------------------------------------------------------");
		} catch (IOException e) {
			System.out.println("Impressora Automação (192.168.10.5) está desligada ou fora de serviço "
					+ "\n ---------------------------------------------------------------------------------------------------- ");
		}
		// --------------------------------------------------------------------------------------------
		// Conexão à impressora Vendas ST
		try {
			// Conexão ao menu RICOH da impressora Vendas
			doc_imp_vendas_st = Jsoup.connect("http://192.168.10.8/web/guest/br/websys/webArch/getStatus.cgi").get();
			String status_geral_vendas_st = doc_imp_vendas_st.getElementsByClass("listboxddm").text();

			resultado_check = impressora.Check(status_geral_vendas_st);
			// Tela para mostrar os status das impressoras:
			System.out.println(" Status Impressora Vendas (192.168.10.8): " + resultado_check[0] + "\n Status Tonner Vendas: "
					+ resultado_check[1]
					+ "\n ----------------------------------------------------------------------------------------------------");
		}
		// Erro caso a impressora não responda
		catch (IOException e) {
			System.out.println("Impressora Vendas (192.168.10.8) está desligada ou fora de serviço "
					+ "\n ---------------------------------------------------------------------------------------------------- ");
		}
		// --------------------------------------------------------------------------------------------
		// Conexão à impressora Laboratorio de Desenvolvimento
		try {
			doc_imp_labd = Jsoup.connect("http://192.168.10.9/web/guest/pt/websys/webArch/mainFrame.cgi").get();
			String status_geral_labd = doc_imp_labd.getElementsByClass("staticProp").text();

			resultado_check_eng = impressora_eng.Check(status_geral_labd);
			// Tela para mostrar os status das impressoras:
			System.out.println(" Status Impressora Lab. Desenv. (192.168.10.9): " + resultado_check_eng[0]
					+ "\n Status Tonner Lab. Desenv.: " + resultado_check_eng[1]
					+ "\n ----------------------------------------------------------------------------------------------------");
			}
		catch (IOException e) {
			System.out.println("Impressora Lab.Desenv. (192.168.10.9) está desligada ou fora de serviço "
					+ "\n ---------------------------------------------------------------------------------------------------- ");
		}
		// --------------------------------------------------------------------------------------------
		// Conexão à impressora Polo Apontamento
		try {
			doc_imp_polo_apont = Jsoup.connect("http://192.168.10.7/main.asp?Lang=en-us").get();
			String status_geral_polo_apont = doc_imp_polo_apont.getElementsByClass("settingCategoryL11").text();

			// Checagem de erro especifico para impressoras MP3510SF
			String status_geral_polo_apont_sc = doc_imp_polo_apont.getElementsByTag("tr").text();
			
			resultado_check = impressora_eng.Check(status_geral_polo_apont);
			resultado_check_eng = impressora_eng.Check(status_geral_polo_apont_sc);			
			// Tela para mostrar os status das impressoras:
			System.out.println(" Status Impressora Polo de Apontamento (192.168.10.7): " + resultado_check_eng[0]
					+ "\n Status Tonner Polo de apontamento: " + resultado_check[1]
					+ "\n ----------------------------------------------------------------------------------------------------");
		} catch (IOException e) {
			System.out.println("Impressora Polo de apontamento (192.168.10.7) está desligada ou fora de serviço "
					+ "\n ---------------------------------------------------------------------------------------------------- ");
		}
		// --------------------------------------------------------------------------------------------
		// Conexão à impressora Economico
		try {
			doc_imp_eco = Jsoup.connect("http://192.168.10.6/main.asp?Lang=en-us").get();
			String status_geral_eco = doc_imp_eco.getElementsByClass("settingCategoryL11").text();

			// Checagem de erro especifico para impressoras MP3510SF
			String status_geral_eco_sc = doc_imp_eco.getElementsByTag("tr").text();
			
			resultado_check = impressora_eng.Check(status_geral_eco);
			resultado_check_eng = impressora_eng.Check(status_geral_eco_sc);	
			// Tela para mostrar os status das impressoras:
			System.out.println(" Status Impressora Economico (192.168.10.6): " + resultado_check_eng[0]
					+ "\n Status Tonner Economico: " + resultado_check[1]
					+ "\n ----------------------------------------------------------------------------------------------------");
		} catch (IOException e) {
			System.out.println("Impressora Economico (192.168.10.6) está desligada ou fora de serviço "
					+ "\n ---------------------------------------------------------------------------------------------------- ");
		}
		// --------------------------------------------------------------------------------------------
		// Conexão à impressora Laboratorio de Analises
		try {

			doc_imp_laba = Jsoup.connect("http://192.168.10.10/main.asp?Lang=en-us").get();
			String status_geral_laba = doc_imp_laba.getElementsByClass("settingCategoryL11").text();

			// Checagem de erro especifico para impressoras MP3510SF
			String status_geral_laba_sc = doc_imp_laba.getElementsByTag("tr").text();
			
			resultado_check = impressora_eng.Check(status_geral_laba);
			resultado_check_eng = impressora_eng.Check(status_geral_laba_sc);					
			// Tela para mostrar os status das impressoras:
			System.out.println(" Status Impressora Lab. Analises (192.168.10.10): " + resultado_check_eng[0]
					+ "\n Status Tonner Lab. Analises: " + resultado_check[1]
					+ "\n ----------------------------------------------------------------------------------------------------");
		} catch (IOException e) {
			System.out.println("Impressora Lab.Analises (192.168.10.10) está desligada ou fora de serviço "
					+ "\n ---------------------------------------------------------------------------------------------------- ");
		}		
		// --------------------------------------------------------------------------------------------
		// Conexão à impressora Almoxarifado
		try {
			doc_imp_alm = Jsoup.connect("http://192.168.10.13/main.asp?Lang=en-us").get();
			String status_geral_alm = doc_imp_alm.getElementsByClass("settingCategoryL11").text();

			// Checagem de erro especifico para impressoras MP3510SF
			String status_geral_alm_sc = doc_imp_alm.getElementsByTag("tr").text();
			
			resultado_check = impressora_eng.Check(status_geral_alm);
			resultado_check_eng = impressora_eng.Check(status_geral_alm_sc);			
			// Tela para mostrar os status das impressoras:
			System.out.println(" Status Impressora Almoxarifado (192.168.10.13): " + resultado_check_eng[0]
					+ "\n Status Tonner Almoxarifado: " + resultado_check[1]
					+ "\n ----------------------------------------------------------------------------------------------------");
		} catch (IOException e) {
			System.out.println("Impressora Almoxarifado (192.168.10.13) está desligada ou fora de serviço "
					+ "\n ---------------------------------------------------------------------------------------------------- ");
		}
		// --------------------------------------------------------------------------------------------
		// Conexão à impressora Manutenção Elétrica
		try {
			doc_imp_man = Jsoup.connect("http://192.168.10.14/main.asp?Lang=en-us").get();
			String status_geral_man = doc_imp_man.getElementsByClass("settingCategoryL11").text();

			// Checagem de erro especifico para impressoras MP3510SF
			String status_geral_man_sc = doc_imp_man.getElementsByTag("tr").text();
			
			resultado_check = impressora_eng.Check(status_geral_man);
			resultado_check_eng = impressora_eng.Check(status_geral_man_sc);
			// Tela para mostrar os status das impressoras:
			System.out.println(" Status Impressora Manutenção Elétrica (192.168.10.14): " + resultado_check_eng[0]
					+ "\n Status Tonner Manutenção Elétrica: " + resultado_check[1]
					+ "\n ----------------------------------------------------------------------------------------------------");
		} catch (IOException e) {
			System.out.println("Impressora Manutenção Elétrica (192.168.10.14) está desligada ou fora de serviço "
					+ "\n ---------------------------------------------------------------------------------------------------- ");
		}
	}
}