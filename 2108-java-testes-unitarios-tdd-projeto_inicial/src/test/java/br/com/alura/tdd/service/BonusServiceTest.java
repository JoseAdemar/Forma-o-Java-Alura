package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	void deveriaNaoReceberBonificacaoCasoSalarioSejaMuitoAlto() {

		BonusService bs = new BonusService();
		
		assertThrows(IllegalArgumentException.class, () -> bs.calcularBonus
				(new Funcionario("Ana", LocalDate.now(), new BigDecimal("50000"))));
//		try {
//
//			BigDecimal bonus = bs.calcularBonus(new Funcionario("Joao", LocalDate.now(), new BigDecimal("50000")));
//
//		} catch (Exception e) {
//          assertEquals("Salario muito alto não pode receber bonus", e.getMessage());
//		}
	}

	@Test
	void deveriaReceberBonificacaoCasoBonusNaoSejaMaiorQueMil() {

		BonusService bs = new BonusService();
		BigDecimal bonus = bs.calcularBonus(new Funcionario("Joao", LocalDate.now(), new BigDecimal("5000")));
		assertEquals(new BigDecimal("500.00"), bonus);
	}

	@Test
	void deveriaReceberBonificacaoCasoSalarioSejaExatamenteDezMil() {

		BonusService bs = new BonusService();
		BigDecimal bonus = bs.calcularBonus(new Funcionario("Joao", LocalDate.now(), new BigDecimal("10000")));
		assertEquals(new BigDecimal("1000.00"), bonus);
	}

}
