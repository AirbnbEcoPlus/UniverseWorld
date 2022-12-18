package fr.endide.universeworld.managers;

import org.bukkit.Location;
import org.bukkit.World;

import java.util.List;

public class world {
    String name;
    String author;
    World world;
    World nether;
    World end;
    List<Location> entryPortal;
    List<Location> exitPortal;
    public world(String name, String author, World world, World nether, World end, List<Location> entryPortal, List<Location> exitPortal) {
        this.name = name;
        this.author = author;
        this.world = world;
        this.nether = nether;
        this.end = end;
        this.entryPortal = entryPortal;
        this.exitPortal = exitPortal;
    }


}
