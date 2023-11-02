package com.directi.training.dip.exercice_refactored;

public class DatabaseWriter implements DataWriter {
	@Override
    public void writeData(String data) throws IOException {
        MyDatabase database = new MyDatabase();
        database.write(data);
    }
}
