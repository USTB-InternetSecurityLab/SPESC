package edu.ustb.sei.mde.smartcontract.design;

import org.eclipse.draw2d.PositionConstants;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.layout.AbstractLayoutEditPartProvider;
import org.eclipse.sirius.diagram.ui.tools.api.layout.provider.CompoundLayoutProvider;
import org.eclipse.sirius.diagram.ui.tools.api.layout.provider.InlineEdgeLayoutProvider;
import org.eclipse.sirius.diagram.ui.tools.api.layout.provider.LayoutProvider;
import org.eclipse.sirius.diagram.ui.tools.api.layout.provider.LineLayoutProvider;

public class SmartContractLayoutProvider implements LayoutProvider {
	
	/** The GMF layout provider. */
    private CompoundLayoutProvider layoutProvider;

	public SmartContractLayoutProvider() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean provides(IGraphicalEditPart container) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public AbstractLayoutEditPartProvider getLayoutNodeProvider(IGraphicalEditPart container) {
		// TODO Auto-generated method stub
		if (this.layoutProvider == null) {
            this.layoutProvider = new CompoundLayoutProvider();
            LineLayoutProvider lineLayoutProvider = new LineLayoutProvider();
            lineLayoutProvider.getPadding().right = 80;
            lineLayoutProvider.setHorizontal(true);
            this.layoutProvider.addProvider(lineLayoutProvider);
            InlineEdgeLayoutProvider inlineEdgeLayoutProvider = new InlineEdgeLayoutProvider();
            inlineEdgeLayoutProvider.setSide(PositionConstants.EAST_WEST);
            inlineEdgeLayoutProvider.setStart(PositionConstants.RIGHT);
            inlineEdgeLayoutProvider.setAlignment(PositionConstants.VERTICAL);
            inlineEdgeLayoutProvider.setChangeNodeHeight(true);
            inlineEdgeLayoutProvider.setChangeNodeWidth(true);
            inlineEdgeLayoutProvider.getPaddings().top = 50;
            this.layoutProvider.addProvider(inlineEdgeLayoutProvider);
        }
        return this.layoutProvider;
	}

	@Override
	public boolean isDiagramLayoutProvider() {
		// TODO Auto-generated method stub
		return false;
	}

}
