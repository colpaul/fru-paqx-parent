/**
 * Copyright &copy; 2017 Dell Inc. or its subsidiaries.  All Rights Reserved.
 * Dell EMC Confidential/Proprietary Information
 */

package com.dell.cpsd.paqx.fru.rest.repository;

import com.dell.converged.capabilities.compute.discovered.nodes.api.NodeEventDataDiscovered;
import com.dell.cpsd.paqx.fru.rest.domain.Job;

import java.util.UUID;

/**
 * Copyright &copy; 2017 Dell Inc. or its subsidiaries.  All Rights Reserved.
 * Dell EMC Confidential/Proprietary Information
 */
public interface NodeDiscoveredRepository {
    void save(NodeEventDataDiscovered nodeEventDataDiscovered);

    NodeEventDataDiscovered[] findAll();

    NodeEventDataDiscovered find(String nodeID);
}
