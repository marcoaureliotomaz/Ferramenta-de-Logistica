package com.algaworks.algalog.domain.service;

import org.springframework.stereotype.Service;

import com.algaworks.algalog.api.exception.EntidadeNaoEncontradaException;
import com.algaworks.algalog.api.exception.NegocioException;
import com.algaworks.algalog.domain.model.Entrega;
import com.algaworks.algalog.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BuscaEntregaService {
	
	private EntregaRepository entregaRepository;
	
	public Entrega buscar(Long entregaId) {
		 return entregaRepository.findById(entregaId)
				 .orElseThrow(()-> new EntidadeNaoEncontradaException("Entrega não encontrada"));
	}

}
