package org.joaov_sha.screenmatch.model;

import java.util.List;

public record DadosSerieRecord(int page, List<Object> results, int total_pages, int total_results) {
    
}
