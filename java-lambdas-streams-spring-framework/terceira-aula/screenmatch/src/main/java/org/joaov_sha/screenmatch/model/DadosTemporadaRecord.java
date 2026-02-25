package org.joaov_sha.screenmatch.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosTemporadaRecord(Integer season_number, String air_date, List<EpisodioRecord> episodes) {}