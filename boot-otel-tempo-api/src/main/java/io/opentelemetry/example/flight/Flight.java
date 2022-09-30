package io.opentelemetry.example.flight;

import java.util.Date;


public class Flight {

	private String origem;
	private String destino;
	private String empresa;
	private Date dataPartida;
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public Date getDataPartida() {
		return dataPartida;
	}
	public void setDataPartida(Date dataPartida) {
		this.dataPartida = dataPartida;
	}
	@Override
	public String toString() {
		return "Voo [origem=" + origem + ", destino=" + destino + ", empresa=" + empresa + ", dataPartida="
				+ dataPartida + "]";
	}
	
}
