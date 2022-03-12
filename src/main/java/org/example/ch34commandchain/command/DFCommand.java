package org.example.ch34commandchain.command;

import org.example.ch34commandchain.CommandVO;
import org.example.ch34commandchain.command_name.df.AbstractDF;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class DFCommand extends Command {
	public String execute(CommandVO vo) {
		return super.buildChain(AbstractDF.class).get(0).handleMessage(vo);
	}
}
