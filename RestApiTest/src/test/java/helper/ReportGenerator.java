package helper;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ReportGenerator {
    public static void main(String[] args) {
        File directory = new File("./");
        String path = directory.getAbsolutePath().replace(".", "") + "build\\reports\\cucumber\\";
        File reportFolder = new File(path + "CustomReport");

        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add(path + "report.json");

        Configuration configuration = new Configuration(reportFolder, "UPB 2021");
        configuration.addClassifications("Owner", "Ignacio");
        configuration.addClassifications("SO", "Windows");
        configuration.addClassifications("Project", "TODO.LY");
        configuration.setBuildNumber("0.1");

        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        reportBuilder.generateReports();
    }
}
