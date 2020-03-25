package com.demo.flight.timings.collision.dto;

import com.demo.flight.timings.collision.entity.Terminal;

public class TerminalDTO {

	private Terminal terminal;

	public Terminal getTerminal() {
		return terminal;
	}

	public void setTerminal(Terminal terminal) {
		this.terminal = terminal;
	}

	public TerminalDTO(Terminal terminal) {
		super();
		this.terminal = terminal;
	}

	public TerminalDTO() {
		super();
	}
	@Override
	public String toString() {
		return "TerminalDTO [terminal=" + terminal + "]";
	}

}
