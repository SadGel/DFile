import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by User15 on 27.07.2017.
 */
public class Main_Run {


    /**
     * Created by User15 on 27.07.2017.
     */

        public static void saveUrl(final String filename, final String urlString)
                throws MalformedURLException, IOException {
            BufferedInputStream in = null;
            FileOutputStream fout = null;
            try {
                in = new BufferedInputStream(new URL(urlString).openStream());
                fout = new FileOutputStream(filename);

                final byte data[] = new byte[1024];
                int count;
                int i=0;
                while ((count = in.read(data, 0, 1024)) != -1) {
                    i++;
                    fout.write(data, 0, count);
                    System.out.println(i);
                    System.out.println(count);
                }
            } finally {
                if (in != null) {
                    in.close();
                }
                if (fout != null) {
                     fout.close();
                }
            }
        }

        public static void main(String[] args) {
            try

            {
                saveUrl("d:/123.rar","http://95.68.244.58:888/res/time.tmt");

            }catch (IOException e) {
                e.printStackTrace();
            }


        }
    }


