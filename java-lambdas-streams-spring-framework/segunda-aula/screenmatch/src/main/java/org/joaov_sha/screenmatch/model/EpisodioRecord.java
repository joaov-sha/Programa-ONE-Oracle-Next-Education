package org.joaov_sha.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record EpisodioRecord(String name, String air_date, Integer vote_average) {}
