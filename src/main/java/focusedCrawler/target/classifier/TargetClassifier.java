/*
############################################################################
##
## Copyright (C) 2006-2009 University of Utah. All rights reserved.
##
## This file is part of DeepPeep.
##
## This file may be used under the terms of the GNU General Public
## License version 2.0 as published by the Free Software Foundation
## and appearing in the file LICENSE.GPL included in the packaging of
## this file.  Please review the following to ensure GNU General Public
## Licensing requirements will be met:
## http://www.opensource.org/licenses/gpl-license.php
##
## If you are unsure which license is appropriate for your use (for
## instance, you are interested in developing a commercial derivative
## of DeepPeep), please contact us at deeppeep@sci.utah.edu.
##
## This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING THE
## WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.
##
############################################################################
 */
package focusedCrawler.target.classifier;

import focusedCrawler.target.model.Page;

/**
 * <p>
 * </p>
 *
 * <p>
 * Description:
 * </p>
 *
 * <p>
 * Copyright: Copyright (c) 2004
 * </p>
 *
 * <p>
 * </p>
 *
 * @author Luciano Barbosa
 * @version 1.0
 */
public interface TargetClassifier {

    public TargetRelevance classify(Page page) throws TargetClassifierException;

    public static class TargetRelevance {
        
        public static TargetRelevance RELEVANT = new TargetRelevance(true, 1.0);
        public static TargetRelevance IRRELEVANT = new TargetRelevance(false, 0.0);
        
        private double relevance;
        private boolean isRelevant;
        
        public TargetRelevance(boolean isRelevant, double relevance) {
            this.isRelevant = isRelevant;
            this.relevance = relevance;
        }

        public double getRelevance() {
            return relevance;
        }

        public boolean isRelevant() {
            return isRelevant;
        }

    }

}
