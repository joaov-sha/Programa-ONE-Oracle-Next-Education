package org.joaov_sha.screenmatch.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerieRecord(int page, List<DadosTemporadaRecord> results, int total_pages, int total_results) {
    
}
