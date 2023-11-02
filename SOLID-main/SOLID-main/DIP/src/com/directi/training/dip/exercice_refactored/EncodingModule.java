package com.directi.training.dip.exercice_refactored;

public class EncodingModule {
	private final DataReader reader;
    private final DataWriter writer;

    public EncodingModule(DataReader reader, DataWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public void encode() throws IOException {
        String data = reader.readData();
        String encodedString = Base64.getEncoder().encodeToString(data.getBytes());
        writer.writeData(encodedString);
    }
}
