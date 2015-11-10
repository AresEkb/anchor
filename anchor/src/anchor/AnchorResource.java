package anchor;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

public class AnchorResource extends XMIResourceImpl {

    public AnchorResource(URI uri) {
        super(uri);
    }
    
    @Override
    protected boolean useUUIDs() {
        return true;
    }

}
