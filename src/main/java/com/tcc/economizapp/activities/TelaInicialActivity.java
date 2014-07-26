package com.tcc.economizapp.activities;

import com.tcc.economizapp.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class TelaInicialActivity extends Activity {

	private final int DURACAO_DA_TELA = 3000;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// seta o layout dessa atividade
		setContentView(R.layout.tela_abertura);
		// o postDelayed faz com que a nossa atividade principal seja startada
		// depois do intervalo especificado na constante (DURACAO_DA_TELA)
		new Handler().postDelayed(new InnerRunnable(), DURACAO_DA_TELA);
	}

	private class InnerRunnable implements Runnable {
		public void run() {
			// criamos um intent para nossa classe Principal
			Intent minhaAcao = new Intent(TelaInicialActivity.this,
					CalculaMediaActivity.class);
			// startamos uma atividade passando o intent criado
			TelaInicialActivity.this.startActivity(minhaAcao);
			// fecha a atividade
			TelaInicialActivity.this.finish();
		}
	}
}
