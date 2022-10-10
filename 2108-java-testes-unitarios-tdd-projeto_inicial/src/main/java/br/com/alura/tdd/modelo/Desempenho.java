package br.com.alura.tdd.modelo;

import java.math.BigDecimal;

public enum Desempenho {

	A_DESEJAR {
		@Override
		public BigDecimal informaODesempenno() {
		
			return new BigDecimal("0.3");
		}
	}, BOM {
		@Override
		public BigDecimal informaODesempenno() {
			
			return new BigDecimal("1.5");
		}
	}, OTIMO {
		@Override
		public BigDecimal informaODesempenno() {
			
			return new BigDecimal("2.0");
		}
	};
	
	public abstract BigDecimal informaODesempenno();
}
