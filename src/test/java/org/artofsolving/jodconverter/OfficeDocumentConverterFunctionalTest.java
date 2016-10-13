//
// JODConverter - Java OpenDocument Converter
// Copyright 2004-2012 Mirko Nasato and contributors
//
// JODConverter is Open Source software, you can redistribute it and/or
// modify it under either (at your option) of the following licenses
//
// 1. The GNU Lesser General Public License v3 (or later)
//    -> http://www.gnu.org/licenses/lgpl-3.0.txt
// 2. The Apache License, Version 2.0
//    -> http://www.apache.org/licenses/LICENSE-2.0.txt
//
package org.artofsolving.jodconverter;

import org.testng.annotations.Test;

@Test(groups="functional")
public class OfficeDocumentConverterFunctionalTest {

//    public void runAllPossibleConversions() throws IOException {
//        OfficeManager officeManager = new DefaultOfficeManagerConfiguration().buildOfficeManager();
//        OfficeDocumentConverter converter = new OfficeDocumentConverter(officeManager);
//        DocumentFormatRegistry formatRegistry = converter.getFormatRegistry();
//        
//        officeManager.start();
//        try {
//            File dir = new File("src/test/resources/documents");
//            File[] files = dir.listFiles(new FilenameFilter() {
//            	public boolean accept(File dir, String name) {
//            		return !name.startsWith(".");
//            	}
//            });
//			for (File inputFile : files) {
//                String inputExtension = FilenameUtils.getExtension(inputFile.getName());
//                DocumentFormat inputFormat = formatRegistry.getFormatByExtension(inputExtension);
//                assertNotNull(inputFormat, "unknown input format: " + inputExtension);
//                Set<DocumentFormat> outputFormats = formatRegistry.getOutputFormats(inputFormat.getInputFamily());
//                for (DocumentFormat outputFormat : outputFormats) {
//                    File outputFile = File.createTempFile("test", "." + outputFormat.getExtension());
//                    outputFile.deleteOnExit();
//                    System.out.printf("-- converting %s to %s... ", inputFormat.getExtension(), outputFormat.getExtension());
//                    converter.convert(inputFile, outputFile, outputFormat);
//                    System.out.printf("done.\n");
//                    assertTrue(outputFile.isFile() && outputFile.length() > 0);
//                    //TODO use file detection to make sure outputFile is in the expected format
//                }
//            }
//        } finally {
//            officeManager.stop();
//        }
//    }

}
