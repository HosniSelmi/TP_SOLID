package com.directi.training.dip.exercice_refactored;

public class EncodingModuleClient {
	public static void main(String[] args) throws IOException {
        DataReader reader = new FileReaderAdapter();
        DataWriter writer = new DatabaseWriter();
        EncodingModule encodingModule = new EncodingModule(reader, writer);
        encodingModule.encode();
    }
}
