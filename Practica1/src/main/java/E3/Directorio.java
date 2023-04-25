package E3;

import java.util.ArrayList;

public class Directorio {
    private ArrayList<Documento> documentos;

    public Directorio() {
        documentos = new ArrayList<Documento>();
    }

    public void agregarDocumento(Documento documento) {
        documentos.add(documento);
    }

    public Documento buscarDocumento(String nombre) {
        for (Documento documento : documentos) {
            if (documento.getNombre().equals(nombre)) {
                return documento;
            }
        }
        return null;
    }

    public void borrarDocumento(Documento documento) {
        documentos.remove(documento);
    }

    public ArrayList<Documento> getDocumentos() {
        return documentos;
    }
}
