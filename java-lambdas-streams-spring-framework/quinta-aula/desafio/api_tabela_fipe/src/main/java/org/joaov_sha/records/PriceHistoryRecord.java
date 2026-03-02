package org.joaov_sha.records;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record PriceHistoryRecord(String month, String price, String reference) {}