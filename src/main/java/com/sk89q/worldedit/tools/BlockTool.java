// $Id$
/*
 * WorldEdit
 * Copyright (C) 2010 sk89q <http://www.sk89q.com> and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
*/

package com.sk89q.worldedit.tools;

import com.sk89q.worldedit.*;

/**
 * Represents a tool that uses a block..
 * 
 * @author sk89q
 */
public interface BlockTool extends Tool {
    /**
     * Perform the action. Should return true to deny the default
     * action.
     * 
     * @param server 
     * @param config 
     * @param player
     * @param session
     * @param clicked
     * @return true to deny
     */
    public boolean actPrimary(ServerInterface server, LocalConfiguration config,
            LocalPlayer player, LocalSession session, WorldVector clicked);
}
