package org.joaov_sha.records;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record CarRecord(String codeFipe, String fuel, String fuelAcronym, String model, int modelYear, String price, PriceHistoryRecord PriceHistoryRecord, String referenceMonth, int vehicleType) {}