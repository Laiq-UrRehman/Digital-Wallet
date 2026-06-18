import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class DataPersistenceHandler {
    public static void saveState(SerializableDataManager manager, String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(manager);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SerializableDataManager loadState(String filePath) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            return (SerializableDataManager) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new SerializableDataManager();
        }
    }
}