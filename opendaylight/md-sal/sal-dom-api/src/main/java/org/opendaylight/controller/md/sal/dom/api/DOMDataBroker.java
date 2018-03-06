/*
 * Copyright (c) 2014 Cisco Systems, Inc. and others. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.opendaylight.controller.md.sal.dom.api;

import org.opendaylight.controller.md.sal.common.api.data.AsyncDataBroker;
import org.opendaylight.controller.md.sal.common.api.data.TransactionChainFactory;
import org.opendaylight.controller.md.sal.common.api.data.TransactionChainListener;
import org.opendaylight.controller.sal.core.api.BrokerService;
import org.opendaylight.yangtools.yang.data.api.YangInstanceIdentifier;
import org.opendaylight.yangtools.yang.data.api.schema.NormalizedNode;

/**
 * Data Broker which provides data transaction and data change listener functionality
 * using {@link NormalizedNode} data format.
 *
 * <p>
 * This interface is type capture of generic interfaces and returns type captures
 * of results for client-code convenience.
 *
 */
public interface DOMDataBroker extends
        AsyncDataBroker<YangInstanceIdentifier, NormalizedNode<?, ?>, DOMDataChangeListener>,
        TransactionChainFactory<YangInstanceIdentifier, NormalizedNode<?, ?>>, BrokerService,
            DOMExtensibleService<DOMDataBroker, DOMDataBrokerExtension> {

    @Override
    DOMDataReadOnlyTransaction newReadOnlyTransaction();

    @Override
    DOMDataReadWriteTransaction newReadWriteTransaction();

    @Override
    DOMDataWriteTransaction newWriteOnlyTransaction();

    @Override
    DOMTransactionChain createTransactionChain(TransactionChainListener listener);
}
