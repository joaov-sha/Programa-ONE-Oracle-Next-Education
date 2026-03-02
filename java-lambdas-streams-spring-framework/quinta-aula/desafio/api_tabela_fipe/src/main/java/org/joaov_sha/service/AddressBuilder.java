package org.joaov_sha.service;

import java.net.URI;
import java.util.Scanner;

public class AddressBuilder {

    public URI buildAddress(int opcao) {
        String vehicleType = "", brandId = "", modelId = "", yearId = "", fipeCode = "";
        switch (opcao) {
            case 1:
                return URI.create("https://fipe.parallelum.com.br/api/v2/references");
            case 2:
                vehicleType = getVehicleType();
                return URI.create("https://fipe.parallelum.com.br/api/v2/" + vehicleType + "/brands");
            case 3:
                vehicleType = getVehicleType();
                brandId = getBrandId();
                return URI.create(
                        "https://fipe.parallelum.com.br/api/v2" + vehicleType + "/brands/" + brandId + "/models");
            case 4:
                vehicleType = getVehicleType();
                brandId = getBrandId();
                modelId = getModelId();
                return URI.create(
                        "https://fipe.parallelum.com.br/api/v2" + vehicleType + "/brands/" + brandId + "/models/"
                                + modelId + "/years");
            case 5:
                vehicleType = getVehicleType();
                brandId = getBrandId();
                modelId = getModelId();
                yearId = getYearId();
                return URI.create(
                        "https://fipe.parallelum.com.br/api/v2" + vehicleType + "/brands/" + brandId + "/models/"
                                + modelId + "/years/" + Validator.rearrangeDate(yearId));
            case 6:
                vehicleType = getVehicleType();
                brandId = getBrandId();
                return URI.create(
                        "https://fipe.parallelum.com.br/api/v2/" + vehicleType + "/brands" + brandId + "/years");
            case 7:
                vehicleType = getVehicleType();
                brandId = getBrandId();
                yearId = getYearId();
                return URI.create("https://fipe.parallelum.com.br/api/v2/" + vehicleType + "/brands/" + brandId
                        + "/years/" + yearId + "/models");
            case 8:
                vehicleType = getVehicleType();
                fipeCode = getFipeCode();
                return URI.create("https://fipe.parallelum.com.br/api/v2/" + vehicleType + "/" + fipeCode + "/years");
            case 9:
                vehicleType = getVehicleType();
                fipeCode = getFipeCode();
                yearId = getYearId();
                return URI.create(
                        "https://fipe.parallelum.com.br/api/v2/" + vehicleType + "/" + fipeCode + "/years/" + yearId);
            case 10:
                vehicleType = getVehicleType();
                fipeCode = getFipeCode();
                yearId = getYearId();
                return URI.create(
                        "https://fipe.parallelum.com.br/api/v2/" + vehicleType + "/" + fipeCode + "/years/" + yearId + "/history");
            default:
                System.out.println("Opção inválida informada!");
                    return URI.create("");
        }
    }

    private String getVehicleType() {
        Scanner s = new Scanner(System.in);
        String vehicleType = "";
        do {
            System.out.print("Informe o tipo de veículo que deseja buscar: ");
            vehicleType = s.nextLine();
        } while (vehicleType.isBlank() || vehicleType.isEmpty());
        s.close();

        if (vehicleType.equalsIgnoreCase("carro")) {
            vehicleType = "cars";
        } else if (vehicleType.equalsIgnoreCase("moto") || vehicleType.equalsIgnoreCase("motocicleta")) {
            vehicleType = "motorcycles";
        } else {
            if (vehicleType.equalsIgnoreCase("caminhao")) {
                vehicleType = "trucks";
            }
        }
        return vehicleType;
    }

    private String getBrandId() {
        Scanner s = new Scanner(System.in);
        String brandId = "";
        do {
            System.out.print("Informe o ID da marca que deseja buscar: ");
            brandId = s.nextLine();
        } while (brandId.isBlank() || brandId.isEmpty());
        s.close();
        return brandId;
    }

    private String getModelId() {
        Scanner s = new Scanner(System.in);
        String modelId = "";
        do {
            System.out.print("Informe o ID do modelo que deseja buscar: ");
            modelId = s.nextLine();
        } while (modelId.isBlank() || modelId.isEmpty());
        s.close();
        return modelId;
    }

    private String getYearId() {
        Scanner s = new Scanner(System.in);
        String yearId = "";
        do {
            System.out.print("Informe o ID do ano que deseja buscar: ");
            yearId = s.nextLine();
        } while (Validator.rearrangeDate(yearId).isEmpty() && Validator.rearrangeDate(yearId).isBlank()
                && !Validator.isValidDate(yearId));
        s.close();
        return yearId;
    }

    public String getFipeCode() {
        Scanner s = new Scanner(System.in);
        String fipeCode = "";
        do {
            System.out.print("Informe o código fipe do veículo para buscar: ");
            fipeCode = s.nextLine();
            fipeCode = Validator.rearrangeFipeCode(fipeCode);
        } while (!Validator.isValidFipeCode(fipeCode) && Validator.rearrangeFipeCode(fipeCode).isBlank()
                || Validator.rearrangeFipeCode(fipeCode).isEmpty());
        s.close();
        return fipeCode;
    }
}
