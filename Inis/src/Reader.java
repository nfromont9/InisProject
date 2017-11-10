import java.awt.*;
import java.io.*;
import java.util.*;

class Reader {
    private static Model model;

    private static OutputStream output = null;
    private static InputStream input = null;

    Reader(Model model) {
        Reader.model = model;
    }
}
