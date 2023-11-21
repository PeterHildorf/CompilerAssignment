// Generated from cc.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ccParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ccVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ccParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(ccParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccParser#hw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHw(ccParser.HwContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccParser#hardware}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHardware(ccParser.HardwareContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(ccParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccParser#outputs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputs(ccParser.OutputsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccParser#latches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLatches(ccParser.LatchesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccParser#update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(ccParser.UpdateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(ccParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(ccParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(ccParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(ccParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Nothing}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNothing(ccParser.NothingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(ccParser.ParenContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccParser#simulate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimulate(ccParser.SimulateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccParser#signal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignal(ccParser.SignalContext ctx);
}