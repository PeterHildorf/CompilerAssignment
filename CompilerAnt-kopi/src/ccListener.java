// Generated from cc.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ccParser}.
 */
public interface ccListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ccParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(ccParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(ccParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#hw}.
	 * @param ctx the parse tree
	 */
	void enterHw(ccParser.HwContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#hw}.
	 * @param ctx the parse tree
	 */
	void exitHw(ccParser.HwContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#hardware}.
	 * @param ctx the parse tree
	 */
	void enterHardware(ccParser.HardwareContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#hardware}.
	 * @param ctx the parse tree
	 */
	void exitHardware(ccParser.HardwareContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(ccParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(ccParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#outputs}.
	 * @param ctx the parse tree
	 */
	void enterOutputs(ccParser.OutputsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#outputs}.
	 * @param ctx the parse tree
	 */
	void exitOutputs(ccParser.OutputsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#latches}.
	 * @param ctx the parse tree
	 */
	void enterLatches(ccParser.LatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#latches}.
	 * @param ctx the parse tree
	 */
	void exitLatches(ccParser.LatchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(ccParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(ccParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNot(ccParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNot(ccParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Or}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterOr(ccParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitOr(ccParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Var}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterVar(ccParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitVar(ccParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code And}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAnd(ccParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAnd(ccParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Nothing}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNothing(ccParser.NothingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Nothing}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNothing(ccParser.NothingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterParen(ccParser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitParen(ccParser.ParenContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#simulate}.
	 * @param ctx the parse tree
	 */
	void enterSimulate(ccParser.SimulateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#simulate}.
	 * @param ctx the parse tree
	 */
	void exitSimulate(ccParser.SimulateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#signal}.
	 * @param ctx the parse tree
	 */
	void enterSignal(ccParser.SignalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#signal}.
	 * @param ctx the parse tree
	 */
	void exitSignal(ccParser.SignalContext ctx);
}